import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.firestore

class AuthViewModel {
    private var auth: FirebaseAuth = FirebaseAuth.getInstance()
    private var db: FirebaseFirestore = Firebase.firestore

    fun signIn(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    println("Sign-in successful ----> User -> ${auth.currentUser?.email}")
//                    onResult(true, null)
                } else {
                    println("Sign-in failed ----> ${task.exception?.message}")
//                    onResult(false, task.exception?.message)
                }
            }
    }

    fun register(email: String, password: String) {
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    println("Registration successful ----> User -> ${auth.currentUser?.email}")
                    val user = hashMapOf(
                        "email" to email,
                        "uid" to auth.currentUser?.uid
                    )
                    db.collection("users").add(user)
                } else {
                    println("Registration failed ----> ${task.exception?.message}")
//                    onResult(false, task.exception?.message)
                }
            }
        }
}