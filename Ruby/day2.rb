M = gets.to_f
T = gets.to_f
X = gets.to_f
puts "The final price of the meal is $#{(M * (1 + (T + X) / 100)).round}."
