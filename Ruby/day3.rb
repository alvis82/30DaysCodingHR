N = gets.strip.to_i
if N % 2 == 1
    puts "Weird"
elsif (N >= 2 and N <= 5) or N > 20
    puts "Not Weird"
else
    puts "Weird"
end
