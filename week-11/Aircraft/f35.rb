require './aircraft.rb'

class F35 < Aircraft

  def initialize(max_ammo = 12, base_damage = 50)
    super(max_ammo, base_damage)
  end

end