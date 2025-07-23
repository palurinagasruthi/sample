def is_prime(num):
    """
    Checks if a given number is prime.
    A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
    """
    if num < 2:  # Numbers less than 2 are not prime
        return False
    for i in range(2, int(num**0.5) + 1):  # Iterate from 2 up to the square root of num
        if num % i == 0:  # If num is divisible by any number in this range, it's not prime
            return False
    return True  # If no divisors are found, the number is prime

print("Prime numbers between 1 and 100 are:")
for number in range(1, 101):  # Iterate through numbers from 1 to 100
    if is_prime(number):
        print(number, end=" ")
print() # For a new line at the end