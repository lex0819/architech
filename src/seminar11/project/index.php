<?php

	include_once('model/messages.php');
	
	$listContatcs = listOfContatcs();

	// echo '<pre>';
	// var_dump($listContatcs);
	// echo '</pre>';

	include_once('header.php');
?>
<body>
	<div class="wrap">
		<div class="content">
			<div class="contacts">
				<?php foreach ($listContatcs as $contact) : ?>				
					<a href="contact.php?id=<?=$contact['cont_id']?>" class="contact">
						<div class="message_title">
							<span><?=$contact['number']?></span>
							<span><?=$contact['name']?></span>
						</div>
						<div><?=$contact['count']?></div>
					</a>
				<?php endforeach; ?>
			</div>
		</div>		
	</div>
</body>
</html>
