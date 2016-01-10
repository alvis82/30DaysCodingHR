n = gets.strip.to_i
(1..n).each do |i|
    num = gets.strip.to_i
    barray = []
    while num > 0
        barray.push(num % 2)
        num >>= 1
    end
    puts barray.reverse.join("")
end
