class Node
    attr_accessor :data, :next

    def initialize value, n
        @data = value
        @next = n
    end
end

class Solution
    def insert(head, value)
        if !head
            head = Node.new(value, nil)
        else
            iter = head
            while iter.next
                iter = iter.next
            end
            iter.next = Node.new(value, nil)
        end
        return head
    end

    def display(head)
        current = head
        while current != nil
            print current.data, " "
            current = current.next
        end
    end
end

mylist = Solution.new
head = nil
T = gets.to_i
for i in 1..T
    data = gets.to_i
    head = mylist.insert(head, data)
end
mylist.display(head)
