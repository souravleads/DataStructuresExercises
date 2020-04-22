Queue:
FIFO
First in first out
A list of collection with the restriction that insertion can be perform at one end (rear)
and deletion can be perform at other end (head/front)

Example: Ticker Counter queue (consider as a horizontal queue)

operations:
Insertion:	Push(x)	-- EnQueue
Deletion:	Pop()	-- DeQueue
			Peek()	--To check the top element
IsEmpty()

Positions
head	
front

Time complexity should be O(1)

