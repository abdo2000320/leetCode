class Node:
    def __init__(self,data=None):
        self.data = data
        self.left = None
        self.right = None
 
class Tree:    
    def insert(self,root,s,data,i):
        while i<len(s):
            if(s[i] == 'L'):
                if root.left is None:
                    root.left = Node(0)
                root = root.left
            else:
                if root.right is None:
                    root.right = Node(0)
                root = root.right
            i+=1
        root.data = data
        return root
 
    def diameter(self,root):
        global dia
        if root is None:
            return 0
        ldepth = self.diameter(root.left)
        rdepth = self.diameter(root.right)
       	# print ("depth",ldepth,rdepth,root.data)
        if ldepth+rdepth+1 > dia:
            dia = ldepth + rdepth +1
        return max(ldepth,rdepth)+1
 
if __name__ == '__main__':
    dia = 0
    with open('test.txt') as f:
        lines = f.readlines()

    N = lines[0].split(" ")[0]
    r = lines[0].split(" ")[1]
    lines.pop(0)
    root = Node(r)
    tree = Tree()
    for i in lines:
        s = str(i.split(" ")[0])
        data = i.split(" ")[1]
        tree.insert(root,s,data,0)
 
    tree.diameter(root)
    print (dia-1)
