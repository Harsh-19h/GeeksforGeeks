<h2><a href="https://www.geeksforgeeks.org/problems/count-digits5716/1">Count Digits</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 14pt; user-select: auto;">Given a positive integer <strong style="user-select: auto;"><code style="user-select: auto;">n</code></strong>, count the number of digits in <code style="user-select: auto;">n</code> that divide <code style="user-select: auto;">n</code> evenly (i.e., without leaving a remainder). Return the total number of such digits.</span></p>
<blockquote style="user-select: auto;">
<p style="user-select: auto;"><span style="font-size: 14pt; user-select: auto;">A digit <code style="user-select: auto;">d</code> of <code style="user-select: auto;">n</code> divides <code style="user-select: auto;">n</code> evenly if the remainder when <code style="user-select: auto;">n</code> is divided by <code style="user-select: auto;">d</code> is 0 (<code style="user-select: auto;">n % d == 0</code>).</span><br style="user-select: auto;"><span style="font-size: 14pt; user-select: auto;">Digits of <code style="user-select: auto;">n</code> should be checked individually. If a digit is 0, it should be ignored because division by 0 is undefined.</span></p>
</blockquote>
<p style="user-select: auto;"><span style="font-size: 14pt; user-select: auto;"><strong style="user-select: auto;">Examples :</strong></span></p>
<pre style="user-select: auto;"><span style="font-size: 14pt; user-select: auto;"><strong style="user-select: auto;">Input: </strong>n = 12<strong style="user-select: auto;">
Output: </strong>2<strong style="user-select: auto;">
Explanation: </strong>1, 2 when both divide 12 leaves remainder 0.<br style="user-select: auto;"></span></pre>
<pre style="user-select: auto;"><span style="font-size: 14pt; user-select: auto;"><strong style="user-select: auto;">Input: </strong>n = 2446<strong style="user-select: auto;">
Output: </strong>1<strong style="user-select: auto;">
Explanation: </strong>Here among 2, 4, 6 only 2 divides 2446 evenly while 4 and 6 do not.</span></pre>
<pre style="user-select: auto;"><span style="font-size: 14pt; user-select: auto;"><strong style="user-select: auto;">Input: </strong>n = 23<strong style="user-select: auto;">
Output: </strong>0<strong style="user-select: auto;">
Explanation: </strong>2 and 3, none of them divide 23 evenly.
</span></pre>
<p style="user-select: auto;"><span style="font-size: 14pt; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">1&lt;= n &lt;=10<sup style="user-select: auto;">5</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Modular Arithmetic</code>&nbsp;<code>Algorithms</code>&nbsp;