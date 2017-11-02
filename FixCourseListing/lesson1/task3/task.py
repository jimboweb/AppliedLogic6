course_listing = """History of China meets Monday in room 200 at 12:45 with Dr. Chandler
Classics 101 meets Monday in room 233 at 5:00 with Dr. Chang
European History meets Monday in room 442 at 9:00 with Dr. Montez
Classics 200 meets Monday in room 442 at 9:30 with Dr. Khanna
History 202 meets Tuesday in room 356 at 9:30 with Dr. Chang
History 101 meets Tuesday in room 356 at 9:00 with Dr. Chandler
Latin 202 meets Tuesday in room 200 at 9:00 with Dr. Chang
History of China meets Wednesday in room 200 at 12:45 with Dr. Chandler
Classics 101 meets Wednesday in room 233 at 5:00 with Dr. Chang
European History meets Wednesday in room 442 at 9:00 with Dr. Montez
Classics 200 meets Wednesday in room 442 at 9:30 with Dr. Khanna
History 202 meets Thursday in room 356 at 9:30 with Dr. Chang
History 101 meets Thursday in room 356 at 9:00 with Dr. Chandler
Latin 202 meets Thursday in room 200 at 9:00 with Dr. Chang
History of China meets Friday in room 200 at 12:45 with Dr. Chandler
Classics 101 meets Friday in room 233 at 5:00 with Dr. Chang
European History meets Friday in room 442 at 9:00 with Dr. Montez
Classics 200 meets Friday in room 442 at 9:30 with Dr. Khanna"""

course_listing_array = course_listing.split('\n')

lineNumber = 0
for line in course_listing:
    if line.startswith("Classics"):
        line.replace('9:30','12:30')
        print(line)
