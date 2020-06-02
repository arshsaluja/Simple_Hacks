def f(n):
    return n // 2 if n % 2 == 0 else 3*n + 1

n=int(input("Enter a value for Collatz conjecture"))
print (f(f(f(f(f(f(f(f(f(f(f(f(f(f(n)))))))))))))))
