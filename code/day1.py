def sum_calibration_values_from_file(file_path):
    total_sum = 0
    with open(file_path, 'r') as file:
        for line in file:
            # Find the first digit
            first_digit = None
            last_digit = None
            for char in line:
                if char.isdigit():
                    first_digit = char
                    break

            # Find the last digit
            for char in reversed(line):
                if char.isdigit():
                    last_digit = char
                    break

            if first_digit is not None and last_digit is not None:
                # Combine the digits to form a two-digit number and add to the total sum
                total_sum += int(first_digit + last_digit)

    return total_sum

# Example usage
file_path = "C:\Users\Stormtroopes\Documents\seniorMaterial\advent\work.txt"  # Replace with your file path
print(sum_calibration_values_from_file(file_path))
