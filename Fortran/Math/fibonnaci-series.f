SUBROUTINE fibo(num,b)
    INTEGER :: a
    INTEGER :: b
    INTEGER :: c
    a = 0
    b = 1

    IF (num < 0) THEN
        b = 0
    ELSE
        IF (num == 0) THEN
            b = 0
        ELSE
            DO i = 1, num-1
                c = a + b
                a = b
                b = c
            END DO
        END IF
    END IF
! to compile the fortran code: run `gfortran -ffree-form filename.f`
! ro run the output `./a.out`    
END SUBROUTINE fibo
PROGRAM fibonnaci
INTEGER :: r
INTEGER :: b
    PRINT*, "Enter the number of elements"
    READ *, r
    do i = 0,r-1
        call fibo(i,b)
        print*, b
    END DO
END PROGRAM fibonnaci
