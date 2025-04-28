package com.example.composebasics.component

import android.media.Image
import android.media.tv.TvView.OnUnhandledInputEventListener
import android.widget.ImageView
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import com.example.composebasics.R
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.contentValuesOf

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditTextExample() {
    OutlinedTextField(
        value = "",
        onValueChange = {},
        label = { Text(stringResource(id = R.string.sample
        )) },
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp)

    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NotOutlinedEditTextExample() {
    TextField(
        value = "",
        onValueChange = {},
        label = { Text(stringResource(id = R.string.sample)) },
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp, bottom = 16.dp),
    )
}

@Preview(showBackground = true)
@Composable
fun UIElementsPreview() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxSize()
            .padding(start = 12.dp, end = 12.dp)
    ) {
        this
        EditTextExample()
        NotOutlinedEditTextExample()
    }
}

@Composable
fun ButtonWithIcon() {
    Button(onClick = {}) {
        Icon(
            painterResource(
                id =
                    R.drawable.baseline_shopping_bag_24
            ),
            contentDescription = stringResource(
                id = R.string.shop
            ),
            modifier = Modifier.size(20.dp)
        )
        Text(
            text = stringResource(id = R.string.buy),
            Modifier.padding(start = 10.dp)
        )
    }
}

@Composable
fun CornerCutShapeButton(){
    Button(onClick = {}, shape = CutCornerShape(percent = 10)) {
        Text(text = stringResource(
            id = R.string.cornerButton)) }
    }
}

@Composable
fun RoundedCornerShapeButton() {
    Button(onClick = {}, shape =
        RoundedCornerShape(10.dp)) {
        Text(text = stringResource(
            id = R.string.rounded))
    }
}

@Composable
fun ElevatedButtonExample() {
    Button(
    onClick = {},
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 8.dp,
            pressedElevation = 10.dp,
            disabledElevation = 0.dp
        )) {
        Text(text = stringResource(
            id = R.string.elevated))
    }
}

@Composable
fun ImageViewExample(){
    Image(
        painterResource(id = R.drawable.img),
        contentDescription = stringResource(
        id = R.string.image),
        modifier = Modifier.size(200.dp)
    )
}



