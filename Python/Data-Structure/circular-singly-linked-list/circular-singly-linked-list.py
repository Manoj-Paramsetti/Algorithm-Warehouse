class Node:

    def __init__(self, dataValue=None):
        self.dataValue = dataValue
        self.next = None

class circularSingleLinkedList:

    def __init__(self):
        self.headValue = None
        self.temp = None

    def insertLast(self, *elements):

        for data in elements:

            if self.headValue == None:
                self.headValue = Node(data)
                self.temp  = self.headValue
            else:
                self.temp.next = Node(data)
                self.temp = self.temp.next
        self.temp.next = self.headValue
        pass

    def insertFirst(self, *elements):

        if self.headValue != None:
            prevheadValue = self.headValue
            self.headValue = None
        else:
            prevheadValue = None

        for data in elements:

            if self.headValue == None:
                self.headValue = Node(data)
                self.temp  = self.headValue
            else:
                self.temp.next = Node(data)
                self.temp = self.temp.next

        if prevheadValue != None:
            self.temp.next = prevheadValue
            self.temp = self.temp.next
        while self.temp.next != prevheadValue:
            self.temp = self.temp.next
        self.temp.next = self.headValue


    def insertMiddle(self, arg1: "data", arg2: "position"):
        node = self.headValue
        for i in range(1,arg2-1):
            if node.next is None:
                return
            node = node.next
        prev = node.next
        node.next = Node(arg1)
        node = node.next
        node.next = prev 
        
        #node = self.headValue
        #for i in range(1,arg2-1):
        #    node = node.next
        #    prev = node.next
        #node.next = Node(arg1)
        #node = node.next
        #node.next = prev
        #while node.next != self.headValue:
        #    node = node.next
        #node.next = self.headValue       
            
    def delete(self, position: "Position to be deleted"):
        #[data|next] --> [data|next] --> [data|next] --> [data|next]
        #                        ^_______________^
        if position == 1:
            node = self.headValue
            while node.next != self.headValue:
                node = node.next
            node.next = self.headValue.next
        else:
            node = self.headValue
            for i in range(position-2):
                node = node.next 
            node.next = node.next.next
            while node.next != self.headValue:
                node = node.next
            node.next = self.headValue

    def display(self):

        printValue = self.headValue
        
        if printValue is None:
            print("list is empty")

        while printValue is not None:
            print (printValue.dataValue)
            printValue = printValue.next
        pass
    
    def hint(self):
        pass
#creating object 
list = circularSingleLinkedList()

list.insertLast(50, 60,70)
#list.display()

'''
It shows the entered things at last

output:
=======

50
60
70
50...
'''

list.insertFirst(10,20,30)
#list.display()

'''
It shows the entered things at first then remaining 

output:
=======

10
20
30
50
60
70
10...
'''

#print(list.insertMiddle.__annotations__)
list.insertMiddle(40,4)
#list.display()
'''
It shows the inserted element at nth position 

output:
=======

10
20
30
40
50
60
70
10...
'''

list.delete(1)
#list.display()
'''
It shows the list after deleting it 

output:
=======

10
20
30
40
50
60
10...
'''
