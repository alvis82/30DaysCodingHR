phone_book = {}
for i in range(int(raw_input())):
    name = raw_input()
    phone = int(raw_input())
    phone_book[name] = phone

while True:
    try:
        name = raw_input()
        if name in phone_book:
            print "=".join([name, str(phone_book[name])])
        else:
            print "Not found"
    except EOFError:
        break
