n = gets.strip.to_i
arr = gets.strip
arr = arr.split(' ').map(&:to_i)
(1..n).each do |i|
    print arr[-i]
    print " "
end
puts
