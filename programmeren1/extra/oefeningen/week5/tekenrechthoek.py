'''
Week 5 - Extra Oefeningen
Oefening 7
'''

def main():
    """Verkrijg hoogte en breedte en teken een rechthoek"""

    MAX = 20
    
    hoogte = int(input("Geef de hoogte in: "))
    breedte = int(input("Geef de breedte in: "))

    hoogte = MAX if hoogte > MAX else hoogte
    breedte = MAX if breedte > MAX else breedte
    
    for _ in range(hoogte):
        print("*" * breedte)

    # interesting, but bad style. will return list of None
    #[print("*" * breedte) for _ in range(hoogte)]
        
if __name__ == "__main__":
    main()
