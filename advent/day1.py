#https://www.geeksforgeeks.org/python-string-isdigit-method/
file_path = r"C:\Users\Stormtroopes\Documents\seniorMaterial\code\work.txt"
total = 0
with open(file_path, 'r') as file:
    for line in file:
        first_digit = None
        last_digit = None
        for char in line:
            if char.isdigit():
                first_digit = char
                break
        for char in reversed(line):
            if char.isdigit():
                last_digit = char
                break
        if first_digit is not None and last_digit is not None:
            total+=int(first_digit + last_digit)

# Print the total sum
print(total)
