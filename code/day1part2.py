#https://www.programiz.com/python-programming/regex
import re
path = r"C:\Users\Stormtroopes\Documents\seniorMaterial\code\work2.txt"
file = open(path, "r")
fileLines = file.readlines()
result = 0
REPATTERN = r"\d|one|two|three|four|five|six|seven|eight|nine"
replaceDict = {
    "one": "1",
    "two": "2",
    "three": "3",
    "four": "4",
    "five": "5",
    "six": "6",
    "seven": "7",
    "eight": "8",
    "nine": "9",
}


for line in fileLines:
    digits = []
    matchedDigit = re.search(REPATTERN, line)
    while matchedDigit:
        digits.append(matchedDigit.group())
        next = matchedDigit.start() + 1
        line = line[next:]
        matchedDigit = re.search(REPATTERN, line)
    digits = [
        replaceDict[digit] if digit in replaceDict else digit for digit in digits
    ]
    result = result + int(digits[0] + digits[-1])

print(result)