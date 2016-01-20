words = gets.strip.split(/[^a-zA-Z]+/)
if words[0] == ""
    words = words.drop(1)
end
puts words.size
puts words
