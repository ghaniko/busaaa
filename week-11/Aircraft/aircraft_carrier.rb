require './aircraft.rb'
require './f16.rb'
require './f35.rb'

class AircraftCarrier

  attr_accessor :health_point, :fired_ammo, :carrier_ammo

  def initialize(carrier_ammo, health_point)
    @carrier_ammo = carrier_ammo
    @health_point = health_point
    @aircrafts = Array.new
  end

  def add_aircraft(aircraft)
    #@aircrafts.push(aircraft)
    @aircrafts<<aircraft
  end

  def fill
      if @carrier_ammo == 0
        puts "There is no more ammo in the storage"
      else
        @aircrafts.each do |aircraft|
          @carrier_ammo -= aircraft.refill(@carrier_ammo) if @carrier_ammo > 0
        end
      end
    puts "Remaining in ammo storage: #{@carrier_ammo.to_s}"
  end

  def carrier_fight(enemy_carrier)
    @@fired_ammo = 0
    @aircrafts.each do |aircraft|
      @@fired_ammo +=  aircraft.ammo
    end
    puts "Amount of ammo fired: #{@@fired_ammo}"
    enemy_carrier.health_point -= @@fired_ammo
  end

  def get_status
    puts "It's dead Jim :(" if health_point <= 0
    puts "HP: #{health_point}, AirCraft Count: #{@aircrafts.length}, Ammo Storage: #{carrier_ammo}"
    puts "AirCrafts:"
    @aircrafts.each {|aircraft| puts "#{aircraft.get_status}"}
  end
end

red_F16 = F16.new

red_F16.refill(100)
red_F16.get_type
red_F16.get_status
red_F16.fight
red_F16.get_status
red_F16.refill(3)
red_F16.get_status

my_carrier = AircraftCarrier.new(500, 20)
my_carrier.add_aircraft(red_F16)
my_carrier.get_status
