def hanoi_tower(nDisks, start, destination, spare):
    if(nDisks == 1):
        print("Move disk from {start} to {destination}.".format(
            start=start, destination=destination))
    else:
        hanoi_tower(nDisks-1, start, spare, destination)
        print("Move disk from {start} to {destination}.".format(
            start=start, destination=destination))
        hanoi_tower(nDisks - 1, spare, destination, start)

# def counter_hanoi():
#     line_count = 0
#     for line in hanoi_tower()


hanoi_tower(5, 'A', 'C', 'B')
