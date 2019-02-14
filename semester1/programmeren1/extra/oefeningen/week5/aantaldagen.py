'''
Week 5 - Extra Oefeningen
Oefening 5
'''
from sys import argv

def is_leap_year(year):
    """Calculate if year is a leap year or not"""
    assert year >= 1583
    return ((year % 4 == 0) and year != 100) or (year % 400 == 0)

def num_of_days(year_start, year_end):
    """Calculate number of days between (inclusive) two years"""
    assert year_start <= year_end
    return sum([366 if is_leap_year(year) else 365 for year in range(year_start, year_end + 1)])
    
def main(args):
    """Read years from command line and calculate number of days"""
    
    y1, y2 = int(args[0]), int(args[1])
    print(f"Aantal dagen in de periode [{y1},{y2}] = {num_of_days(y1, y2)}")
           
if __name__ == "__main__":
    main(argv[1:])
