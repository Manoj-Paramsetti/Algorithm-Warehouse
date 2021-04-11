'''
Interesting Fact:
=================
Recursive can run till 997 times
'''

def factorial(num):
    if (num == 0):
        return 1
    elif (num < 0):
        return "Negative number does not exist"
    else:
        return factorial(num-1)*num

num = int(input())
output = factorial(num)
print(output)