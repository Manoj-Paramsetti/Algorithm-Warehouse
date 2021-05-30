PROGRAM factorial
INTEGER :: a
INTEGER :: sum
    READ *, a
    sum = 1
    ! Do is somewhat similar to for loop
    DO n = 1, a
        sum = sum * n
    END DO
    PRINT*, sum
END PROGRAM factorial