def is_prime n
    return false if n == 1
    sqrt_n = Math.sqrt(n).to_i
    for i in 2..sqrt_n
        return false if n % i == 0
    end
    return true
end

n_of_testcase = gets.to_i
for i in 1..n_of_testcase
    n = gets.to_i
    if is_prime n
        puts "Prime"
    else
        puts "Not prime"
    end
end
