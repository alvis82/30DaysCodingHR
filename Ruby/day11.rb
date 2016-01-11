arr = Array.new(6)
(0...6).each do |i|
    temp = gets.strip.split
    arr[i] = temp.map(&:to_i)
end

max_sum = -100
(0...4).each do |i|
    (0...4).each do |j|
        temp = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] +
               arr[i + 1][j + 1] +
               arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]
        if max_sum < temp
            max_sum = temp
        end
    end
end
puts max_sum
