require 'mathn'
class PracticeExercises
end

puts "Prime divisor ex"

def isPrime(number)
  if number ==2
    true
  else
    for i in 2..Math.sqrt(number) do
      if number % i == 0
       return false
      end
    end
  end
  true
end

def primeDivisors(num)
  primeDivisorsList = []
  for i in 2..num do
    if isPrime(i) && num % i == 0
      primeDivisorsList.push(i)
    end
  end
  primeDivisorsList
end
puts primeDivisors(840).max



