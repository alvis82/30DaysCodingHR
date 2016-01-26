return_day, return_month, return_year = gets.split().map(&:to_i)
expected_day, expected_month, expected_year = gets.split().map(&:to_i)
if return_year > expected_year
    print 10000
elsif return_year == expected_year and
      return_month > expected_month
    print 500 * (return_month - expected_month)
elsif return_year == expected_year and
      return_month == expected_month and
      return_day > expected_day
    print 15 * (return_day - expected_day)
else
    print 0
end
