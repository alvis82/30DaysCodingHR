def find_gcd(a,b)
    if b == 0
        return a
    end

    if a < b
        a, b = b, a
    end

    return find_gcd(b, a % b)
end

a, b = gets.split.map { |s| s.to_i }
puts find_gcd(a, b)
