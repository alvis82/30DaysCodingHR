n = gets.to_i
nums = gets.split().map { |num| num.to_i }
nums.sort!
minad = nums[1] - nums[0]
(2...n).each do |i|
    if minad > nums[i] - nums[i - 1]
        minad = nums[i] - nums[i - 1]
    end
end
(1...n).each do |i|
    if minad == nums[i] - nums[i - 1]
        print "#{nums[i - 1]} #{nums[i]} "
    end
end
puts
