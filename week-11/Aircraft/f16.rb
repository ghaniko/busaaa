require './aircraft.rb'

class F16 < Aircraft

  def initialize(max_ammo = 8, base_damage = 30)
    super(max_ammo, base_damage)
  end
end
