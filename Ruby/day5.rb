t = gets.to_i
(1..t).each do |i|
    a, b, n = gets.split.map { |s| s.to_i }
    p = 1
    r = [a + b * p]
    (2..n).each do |j|
        p *= 2
        r.push(r[-1] + b * p)
    end
    puts r.join(" ")
end
