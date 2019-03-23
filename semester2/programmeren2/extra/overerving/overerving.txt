# Hoofdstuk 3 - Overerving


## Vraag 1
_antwoord:_
1. `a = new A();`
3. `a = new B();`
5. `b = (C) new C();`
6. `b = (B) new C();`


## Vraag 2
_antwoord:_
1. `class Bordspel extends Spel`
2. Ja (Liskov Substitution Principle)


## Vraag 4
_antwoord:_
```
class Bankrekening extends Rekening {
    void stort(double bedrag) {
        // do something
    }
    void trekTerug(double bedrag) {
        // do something
    }
}
```

## Vraag 5
_antwoord:_
```
final void keerIntrestUit() {
    saldo += voorlopigeIntrest;
    voorlopigeIntrest = saldo * rentevoet;
}
```

## Vraag 6
_antwoord:_
```
class PuntMassa implements Tekenbaar, Zwaar {
    public void teken(Uitvoerapparaat ua) {
        // do something
    }
    public double getGewicht() {
        // do something
    }
}
```
