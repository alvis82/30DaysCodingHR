class Person
    attr_accessor :age
    def initialize(initial_Age)
        if initial_Age < 0
            puts "This person is not valid, setting age to 0."
            @age = 0
        else
            @age = initial_Age
        end
    end

    def amIOld()
        if @age < 13
            puts "You are young."
        elsif @age < 18
            puts "You are a teenager."
        else
            puts "You are old."
        end
    end

    def yearPasses()
        @age += 1
    end
end
