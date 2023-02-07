class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var status by rememberSaveable {
                mutableStateOf(false)
            }

            ImageCard(status) { clickStatus ->
                status = clickStatus
            }
        }
    }

    @Composable
    fun ImageCard(
        status: Boolean,
        onClickCallback: (Boolean) -> Unit
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .padding(16.dp),
            shape = RoundedCornerShape(5.dp),
            elevation = 3.dp
        ) {
            Box(
                modifier = Modifier.height(200.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.tmp),
                    contentDescription = "tmp",
                    contentScale = ContentScale.Crop
                )
            }

            Box(
                modifier = Modifier.height (200.dp),
                contentAlignment = Alignment.TopEnd
            ) {
                IconButton(onClick = {
                    onClickCallback(!status)
                }) {
                    Icon(
                        imageVector = if(status) Icons.Default.Favorite else Icons.Default.FavoriteBorder,
                        contentDescription = "Favorite",
                        tint = Color.White
                    )
                }
            }
        }
    }
}