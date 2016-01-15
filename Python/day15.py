class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class Solution:
    def display(self, head):
        current = head
        while current != None:
            print current.data,
            current = current.next

    def insert(self, head, data):
        if not head:
            head = Node(data)
        else:
            iter = head
            while iter.next:
                iter = iter.next
            iter.next = Node(data)
        return head

mylist = Solution()
T = int(input())
head = None
for i in range(T):
    data = int(input())
    head = mylist.insert(head, data)
mylist.display(head);
