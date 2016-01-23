from collections import deque

class Node:
    def __init__(self, data):
        self.data = data
        self.right = self.left = None

class Solution:
    def insert(self, root, data):
        if root == None:
            return Node(data)
        else:
            if data <= root.data:
                cur = self.insert(root.left, data)
                root.left = cur
            else:
                cur = self.insert(root.right, data)
                root.right = cur
        return root

    def levelOrder(self, root):
        queue = deque()
        queue.append(root)
        while queue:
            node = queue.popleft()
            if not node:
                continue
            print node.data,
            queue.append(node.left)
            queue.append(node.right)
        print

T = int(raw_input())
myTree = Solution()
root = None
for i in range(T):
    data = int(raw_input())
    root = myTree.insert(root, data)
myTree.levelOrder(root)
