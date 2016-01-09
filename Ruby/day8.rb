n = gets.to_i
phone_book = {}
(1..n).each do |i|
    name = gets.chomp
    phone = gets.to_i
    phone_book[name] = phone
end

queries = $stdin.read
queries.split("\n").each do |name|
    if phone_book.has_key?(name)
        puts [name, phone_book[name]].join("=")
    else
        puts "Not found"
    end
end
