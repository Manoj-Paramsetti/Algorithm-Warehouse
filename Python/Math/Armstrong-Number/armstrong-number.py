num = int(input("Enter a number: ")) 

sum = 0; size = 0; temp = num; temp2 = num

while(temp2!=0):
    size += 1
    temp2 = int(temp2/10)

while(temp!=0):
    remainder = temp%10
    sum += remainder**size
    temp = int(temp/10)

if(sum == num):
    print("It's an armstrong number")
else:
    print("It's not an armstrong number")

