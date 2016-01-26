return_day, return_month, return_year = map(int, raw_input().split())
expected_day, expected_month, expected_year = map(int, raw_input().split())
if return_year > expected_year:
    print 10000
elif return_year == expected_year and \
     return_month > expected_month:
    print 500 * (return_month - expected_month)
elif return_year == expected_year and \
     return_month == expected_month and \
     return_day > expected_day:
    print 15 * (return_day - expected_day)
else:
    print 0
