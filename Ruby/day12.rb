class Student
    def initialize(firstName, lastName, phone)
        @firstName=firstName
        @lastName=lastName
        @phone=phone
    end

    def display()
        print("First Name: ", @firstName,
              "Last Name: ",@lastName,
              "Phone: ", @phone)
    end
end

class Grade < Student
    def initialize(firstName, lastName, phone, score)
        super(firstName, lastName, phone)
        @score = score
    end

    def calculate()
        if(@score < 40)
            return 'D'
        elsif(@score < 60)
            return 'B'
        elsif(@score < 75)
            return 'A'
        elsif(@score < 90)
            return 'E'
        else
            return 'O'
        end
    end
end

firstName = gets
lastName = gets
phone = gets.to_i
score = gets.to_i
g = Grade.new(firstName, lastName, phone, score)
g.display
print("\nGrade: ", g.calculate)
