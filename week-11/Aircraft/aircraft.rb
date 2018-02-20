
class Aircraft

  attr_accessor :base_damage, :damage, :ammo, :max_ammo

  def initialize(max_ammo, base_damage)
    @max_ammo = max_ammo
    @base_damage = base_damage
    @ammo = 0
    @damage = 0
  end

  def fight
    @damage = @base_damage * @ammo
    @ammo = 0
    return @damage
  end

  def refill(ammo_amount)
    ammo_amount > @max_ammo - @ammo ? filled_in_ammo = @max_ammo - @ammo : filled_in_ammo = ammo_amount
    @ammo += filled_in_ammo
    puts "Unused ammo is: #{ammo_amount - filled_in_ammo}"
    ammo_amount - filled_in_ammo
  end

  def get_type
    self.class
  end

  def get_status
    puts "Type: #{get_type}, Ammo: #{@ammo.to_s}, Base Damage: #{@base_damage.to_s}, All Damage: #{@damage.to_s}"
  end
end
