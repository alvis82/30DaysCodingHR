n = gets.strip.to_i
(1..n).each do |i|
    puts " " * (n - i) + "#" * i
end
