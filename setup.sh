destinationDirectory="$HOME/.config/typoterm"
destinationFile="$destinationDirectory/typoterm-1.0.jar"
shell=$(echo $SHELL)

aliasName="typoterm"
aliasCommand="java -jar $destinationFile"

mkdir -p "$destinationDirectory"

cp typoterm-1.0.jar "$destinationFile"

if [[ "$shell" == *"bash"* ]]; then
    echo "alias $aliasName='$aliasCommand'" >> ~/.bashrc
    echo "Alias created: $aliasName"
    bash
elif [[ "$shell" == *"zsh"* ]]; then
    echo "alias $aliasName='$aliasCommand'" >> ~/.zshrc
    echo "Alias created: $aliasName"
    zsh
else
    echo "Shell not recognized. Please manually update your RC file."
fi
