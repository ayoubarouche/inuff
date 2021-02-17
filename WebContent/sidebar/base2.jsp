<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
</div>

	<div class="toggle" onclick="toggleMenu()" id="togg"></div>
	<script type="text/javascript">
		let d1 = document.getElementById("nav");
		let p1 = document.getElementById("con");
		let p2 = document.getElementById("h");
		function toggleMenu(){
			let navigation = document.querySelector('.navigation');
			let toggle = document.querySelector('.toggle');
			navigation.classList.toggle('active');
			toggle.classList.toggle('active');
			if(getComputedStyle(p1).display != "none"){
					p1.style.display = "none";
						p2.style.display = "block";
 				 } else {
					p1.style.display = "block";
						p2.style.display = "none"
 				 }
		}

        d1.addEventListener("mouseover", () => {p1.style.display = "none";});
		d1.addEventListener("mouseout", () => {p1.style.display = "block";});

        d1.addEventListener("mouseover", () => {p2.style.display = "block";});
		d1.addEventListener("mouseout", () => {p2.style.display = "none";});

	</script>
  