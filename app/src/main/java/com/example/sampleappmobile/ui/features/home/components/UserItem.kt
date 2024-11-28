package com.example.sampleappmobile.ui.features.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.sampleappmobile.R
import com.example.sampleappmobile.application.repositories.UsersRepository
import com.example.sampleappmobile.domain.models.User

@Composable
fun UserItem(
    user: User
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .padding(10.dp)
                .width(120.dp)
                .height(120.dp)
                .fillMaxWidth(0.2f)
                .clip(RoundedCornerShape(20.dp))
                .background(Color.White),
            contentAlignment = Alignment.Center
        ) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(user.image)
                    .crossfade(true)
                    .build(),
                placeholder = painterResource(R.drawable.product_placeholder),
                contentDescription = "",
                modifier = Modifier.size(100.dp),
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth(0.8f)
        ) {

            Text(
                text = user.name,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = Color.Blue
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            MaterialTheme.colors.primary,
                            fontWeight = FontWeight.Bold
                        )
                    ) {
                        append("Имя:  " + user.name)
                    }
                },
                style = MaterialTheme.typography.subtitle1,
                modifier = Modifier,
                fontSize = 16.sp
            )
        }
        Box(
            modifier = Modifier
                .padding(top = 20.dp, end = 20.dp)
                .align(Alignment.Top)
        ) {
            Icon(
                imageVector = Icons.Outlined.FavoriteBorder,
                contentDescription = "",
                tint = MaterialTheme.colors.primary
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewUserItem() {
    UserItem(
        user = UsersRepository.user1,
    )
}



