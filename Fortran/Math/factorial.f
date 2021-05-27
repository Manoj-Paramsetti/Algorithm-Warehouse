program factorial
integer :: a
integer :: sum
    Read *, a
    sum = 1
    do n = 1, a
        sum = sum * n
    end do
    print*, sum
end program factorial