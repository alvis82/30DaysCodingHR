def is_funny (word)
    left, right = 1, word.length - 2
    while left <= right
        if (word[left].ord - word[left - 1].ord).abs !=
           (word[right + 1].ord - word[right].ord).abs
            return false
        end
        left, right = left + 1, right - 1
    end

    return true
end

testcases = gets.to_i
for i in 1..testcases
    word = gets.strip
    if is_funny(word)
        puts "Funny"
    else
        puts "Not Funny"
    end
end
