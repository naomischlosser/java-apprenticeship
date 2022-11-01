def longest_name(names)
  longest = ''
  names.each do |name|
    if longest.length < name
      longest = name
    end
  end
  longest
end

people = ['Adam', 'Clara', 'George', 'Jane']
p longest_name(people)