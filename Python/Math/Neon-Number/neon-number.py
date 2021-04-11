def checkNeonNumber(num):

    num *= num
    sum = 0

    while (num>0):
        last_number = num % 10
        sum += last_number
        num = int(num/10)

    if sum == 9:
        print("The number is a neon number")
    else:
        print("The number is not a neon number")

if __name__ == "__main__":
    num = int(input())
    checkNeonNumber(num)
