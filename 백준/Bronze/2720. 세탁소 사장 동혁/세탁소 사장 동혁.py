from collections import OrderedDict

T = int(input())

COIN_TYPES = OrderedDict([
    ('quarter', 25),
    ('dime', 10),
    ('nickel', 5),
    ('penny', 1)
])


def calculate_exchange(total_change):
    counts = {
        'quarter_count': 0,
        'dime_count': 0,
        'nickel_count': 0,
        'penny_count': 0
    }
    for coinName, coinValue in COIN_TYPES.items():
        if total_change == 0:
            break
        else:
            counts[coinName+'_count'] = total_change // coinValue
            total_change %= coinValue

    return counts


def do_print(targets):
    for key, value in targets.items():
        print(value, end=' ')
    print()


for i in range(T):
    C = int(input())
    result = calculate_exchange(C)
    do_print(result)