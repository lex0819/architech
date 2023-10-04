<?php

	include_once('model/messages.php');
	
	$id = (int)($_GET['id']) ?? 0;
	
	$contact = messagesOfContatc($id);
	// echo '<pre>';
	// var_dump($contact);
	// echo '</pre>';

	include_once('header.php');
?>
<body>
	<div class="wrap">
		<div class="content">
			<a href="index.php" class="contact">&#8592;</a>
			<div class="contact_list">
				<?php if( !empty( $contact) ): ?>
					<div class="contact_title">
						<span class="contact_title_nunber"><?=$contact[0]['number']?></span>
						<span class="contact_title_name"><?=$contact[0]['name']?></span>
					</div>
					<div class="messages">
						<?php foreach ($contact as $oneMessage) : ?>
						<div class="<?php echo $oneMessage['ismy']== 1 ? 'message_my' : 'message_other' ?>">
							<div class="message_text"><?=$oneMessage['text']?></div>
							<div class="message_create"><?=$oneMessage['create_dt']?></div>
						</div> 
					<?php endforeach; ?>
					</div>
				<?php else: ?>
					<div class="e404">
						<h1>Страница не найдена!</h1>
					</div>
				<?php endif; ?>
			</div>
		</div>		
	</div>
</body>
</html>
